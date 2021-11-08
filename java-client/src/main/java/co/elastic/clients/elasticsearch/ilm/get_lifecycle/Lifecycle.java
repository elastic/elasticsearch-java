/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ilm.get_lifecycle;

import co.elastic.clients.elasticsearch.ilm.Policy;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm.get_lifecycle.Lifecycle
@JsonpDeserializable
public class Lifecycle implements JsonpSerializable {
	private final String modifiedDate;

	private final Policy policy;

	private final long version;

	// ---------------------------------------------------------------------------------------------

	private Lifecycle(Builder builder) {

		this.modifiedDate = ModelTypeHelper.requireNonNull(builder.modifiedDate, this, "modifiedDate");
		this.policy = ModelTypeHelper.requireNonNull(builder.policy, this, "policy");
		this.version = ModelTypeHelper.requireNonNull(builder.version, this, "version");

	}

	public static Lifecycle of(Function<Builder, ObjectBuilder<Lifecycle>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code modified_date}
	 */
	public final String modifiedDate() {
		return this.modifiedDate;
	}

	/**
	 * Required - API name: {@code policy}
	 */
	public final Policy policy() {
		return this.policy;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public final long version() {
		return this.version;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("modified_date");
		generator.write(this.modifiedDate);

		generator.writeKey("policy");
		this.policy.serialize(generator, mapper);

		generator.writeKey("version");
		generator.write(this.version);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Lifecycle}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Lifecycle> {
		private String modifiedDate;

		private Policy policy;

		private Long version;

		/**
		 * Required - API name: {@code modified_date}
		 */
		public final Builder modifiedDate(String value) {
			this.modifiedDate = value;
			return this;
		}

		/**
		 * Required - API name: {@code policy}
		 */
		public final Builder policy(Policy value) {
			this.policy = value;
			return this;
		}

		/**
		 * Required - API name: {@code policy}
		 */
		public final Builder policy(Function<Policy.Builder, ObjectBuilder<Policy>> fn) {
			return this.policy(fn.apply(new Policy.Builder()).build());
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(long value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link Lifecycle}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Lifecycle build() {
			_checkSingleUse();

			return new Lifecycle(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Lifecycle}
	 */
	public static final JsonpDeserializer<Lifecycle> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Lifecycle::setupLifecycleDeserializer, Builder::build);

	protected static void setupLifecycleDeserializer(DelegatingDeserializer<Lifecycle.Builder> op) {

		op.add(Builder::modifiedDate, JsonpDeserializer.stringDeserializer(), "modified_date");
		op.add(Builder::policy, Policy._DESERIALIZER, "policy");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");

	}

}
