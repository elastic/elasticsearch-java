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

package co.elastic.clients.elasticsearch.ilm.get_lifecycle;

import co.elastic.clients.elasticsearch.ilm.IlmPolicy;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ilm.get_lifecycle.Lifecycle

/**
 *
 * @see <a href="../../doc-files/api-spec.html#ilm.get_lifecycle.Lifecycle">API
 *      specification</a>
 */
@JsonpDeserializable
public class Lifecycle implements JsonpSerializable {
	private final DateTime modifiedDate;

	private final IlmPolicy policy;

	private final long version;

	// ---------------------------------------------------------------------------------------------

	private Lifecycle(Builder builder) {

		this.modifiedDate = ApiTypeHelper.requireNonNull(builder.modifiedDate, this, "modifiedDate");
		this.policy = ApiTypeHelper.requireNonNull(builder.policy, this, "policy");
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version");

	}

	public static Lifecycle of(Function<Builder, ObjectBuilder<Lifecycle>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code modified_date}
	 */
	public final DateTime modifiedDate() {
		return this.modifiedDate;
	}

	/**
	 * Required - API name: {@code policy}
	 */
	public final IlmPolicy policy() {
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
		this.modifiedDate.serialize(generator, mapper);
		generator.writeKey("policy");
		this.policy.serialize(generator, mapper);

		generator.writeKey("version");
		generator.write(this.version);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Lifecycle}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Lifecycle> {
		private DateTime modifiedDate;

		private IlmPolicy policy;

		private Long version;

		/**
		 * Required - API name: {@code modified_date}
		 */
		public final Builder modifiedDate(DateTime value) {
			this.modifiedDate = value;
			return this;
		}

		/**
		 * Required - API name: {@code policy}
		 */
		public final Builder policy(IlmPolicy value) {
			this.policy = value;
			return this;
		}

		/**
		 * Required - API name: {@code policy}
		 */
		public final Builder policy(Function<IlmPolicy.Builder, ObjectBuilder<IlmPolicy>> fn) {
			return this.policy(fn.apply(new IlmPolicy.Builder()).build());
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(long value) {
			this.version = value;
			return this;
		}

		@Override
		protected Builder self() {
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
			Lifecycle::setupLifecycleDeserializer);

	protected static void setupLifecycleDeserializer(ObjectDeserializer<Lifecycle.Builder> op) {

		op.add(Builder::modifiedDate, DateTime._DESERIALIZER, "modified_date");
		op.add(Builder::policy, IlmPolicy._DESERIALIZER, "policy");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");

	}

}
