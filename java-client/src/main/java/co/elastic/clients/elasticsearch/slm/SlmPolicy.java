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

package co.elastic.clients.elasticsearch.slm;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
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

// typedef: slm._types.Policy

/**
 *
 * @see <a href="../doc-files/api-spec.html#slm._types.Policy">API
 *      specification</a>
 */
@JsonpDeserializable
public class SlmPolicy implements JsonpSerializable {
	@Nullable
	private final SlmConfiguration config;

	private final String name;

	private final String repository;

	@Nullable
	private final Retention retention;

	private final String schedule;

	// ---------------------------------------------------------------------------------------------

	private SlmPolicy(Builder builder) {

		this.config = builder.config;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.repository = ApiTypeHelper.requireNonNull(builder.repository, this, "repository");
		this.retention = builder.retention;
		this.schedule = ApiTypeHelper.requireNonNull(builder.schedule, this, "schedule");

	}

	public static SlmPolicy of(Function<Builder, ObjectBuilder<SlmPolicy>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code config}
	 */
	@Nullable
	public final SlmConfiguration config() {
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
	 * API name: {@code retention}
	 */
	@Nullable
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

		if (this.config != null) {
			generator.writeKey("config");
			this.config.serialize(generator, mapper);

		}
		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("repository");
		generator.write(this.repository);

		if (this.retention != null) {
			generator.writeKey("retention");
			this.retention.serialize(generator, mapper);

		}
		generator.writeKey("schedule");
		generator.write(this.schedule);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SlmPolicy}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SlmPolicy> {
		@Nullable
		private SlmConfiguration config;

		private String name;

		private String repository;

		@Nullable
		private Retention retention;

		private String schedule;

		/**
		 * API name: {@code config}
		 */
		public final Builder config(@Nullable SlmConfiguration value) {
			this.config = value;
			return this;
		}

		/**
		 * API name: {@code config}
		 */
		public final Builder config(Function<SlmConfiguration.Builder, ObjectBuilder<SlmConfiguration>> fn) {
			return this.config(fn.apply(new SlmConfiguration.Builder()).build());
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
		 * API name: {@code retention}
		 */
		public final Builder retention(@Nullable Retention value) {
			this.retention = value;
			return this;
		}

		/**
		 * API name: {@code retention}
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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SlmPolicy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SlmPolicy build() {
			_checkSingleUse();

			return new SlmPolicy(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SlmPolicy}
	 */
	public static final JsonpDeserializer<SlmPolicy> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SlmPolicy::setupSlmPolicyDeserializer);

	protected static void setupSlmPolicyDeserializer(ObjectDeserializer<SlmPolicy.Builder> op) {

		op.add(Builder::config, SlmConfiguration._DESERIALIZER, "config");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::repository, JsonpDeserializer.stringDeserializer(), "repository");
		op.add(Builder::retention, Retention._DESERIALIZER, "retention");
		op.add(Builder::schedule, JsonpDeserializer.stringDeserializer(), "schedule");

	}

}
