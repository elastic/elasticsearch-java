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

package co.elastic.clients.elasticsearch.slm;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: slm._types.Policy
@JsonpDeserializable
public class Policy implements JsonpSerializable {
	private final Configuration config;

	private final String name;

	private final String repository;

	private final Retention retention;

	private final String schedule;

	// ---------------------------------------------------------------------------------------------

	private Policy(Builder builder) {

		this.config = ModelTypeHelper.requireNonNull(builder.config, this, "config");
		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.repository = ModelTypeHelper.requireNonNull(builder.repository, this, "repository");
		this.retention = ModelTypeHelper.requireNonNull(builder.retention, this, "retention");
		this.schedule = ModelTypeHelper.requireNonNull(builder.schedule, this, "schedule");

	}

	public static Policy of(Function<Builder, ObjectBuilder<Policy>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code config}
	 */
	public final Configuration config() {
		return this.config;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code repository}
	 */
	public final String repository() {
		return this.repository;
	}

	/**
	 * Required - API name: {@code retention}
	 */
	public final Retention retention() {
		return this.retention;
	}

	/**
	 * Required - API name: {@code schedule}
	 */
	public final String schedule() {
		return this.schedule;
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

		generator.writeKey("config");
		this.config.serialize(generator, mapper);

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("repository");
		generator.write(this.repository);

		generator.writeKey("retention");
		this.retention.serialize(generator, mapper);

		generator.writeKey("schedule");
		generator.write(this.schedule);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Policy}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Policy> {
		private Configuration config;

		private String name;

		private String repository;

		private Retention retention;

		private String schedule;

		/**
		 * Required - API name: {@code config}
		 */
		public final Builder config(Configuration value) {
			this.config = value;
			return this;
		}

		/**
		 * Required - API name: {@code config}
		 */
		public final Builder config(Function<Configuration.Builder, ObjectBuilder<Configuration>> fn) {
			return this.config(fn.apply(new Configuration.Builder()).build());
		}

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code repository}
		 */
		public final Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * Required - API name: {@code retention}
		 */
		public final Builder retention(Retention value) {
			this.retention = value;
			return this;
		}

		/**
		 * Required - API name: {@code retention}
		 */
		public final Builder retention(Function<Retention.Builder, ObjectBuilder<Retention>> fn) {
			return this.retention(fn.apply(new Retention.Builder()).build());
		}

		/**
		 * Required - API name: {@code schedule}
		 */
		public final Builder schedule(String value) {
			this.schedule = value;
			return this;
		}

		/**
		 * Builds a {@link Policy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Policy build() {
			_checkSingleUse();

			return new Policy(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Policy}
	 */
	public static final JsonpDeserializer<Policy> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Policy::setupPolicyDeserializer, Builder::build);

	protected static void setupPolicyDeserializer(DelegatingDeserializer<Policy.Builder> op) {

		op.add(Builder::config, Configuration._DESERIALIZER, "config");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::repository, JsonpDeserializer.stringDeserializer(), "repository");
		op.add(Builder::retention, Retention._DESERIALIZER, "retention");
		op.add(Builder::schedule, JsonpDeserializer.stringDeserializer(), "schedule");

	}

}
