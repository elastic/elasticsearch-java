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

package co.elastic.clients.elasticsearch.migration.deprecations;

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

// typedef: migration.deprecations.Deprecation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#migration.deprecations.Deprecation">API
 *      specification</a>
 */
@JsonpDeserializable
public class Deprecation implements JsonpSerializable {
	private final String details;

	private final DeprecationLevel level;

	private final String message;

	private final String url;

	// ---------------------------------------------------------------------------------------------

	private Deprecation(Builder builder) {

		this.details = ApiTypeHelper.requireNonNull(builder.details, this, "details");
		this.level = ApiTypeHelper.requireNonNull(builder.level, this, "level");
		this.message = ApiTypeHelper.requireNonNull(builder.message, this, "message");
		this.url = ApiTypeHelper.requireNonNull(builder.url, this, "url");

	}

	public static Deprecation of(Function<Builder, ObjectBuilder<Deprecation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code details}
	 */
	public final String details() {
		return this.details;
	}

	/**
	 * Required - The level property describes the significance of the issue.
	 * <p>
	 * API name: {@code level}
	 */
	public final DeprecationLevel level() {
		return this.level;
	}

	/**
	 * Required - API name: {@code message}
	 */
	public final String message() {
		return this.message;
	}

	/**
	 * Required - API name: {@code url}
	 */
	public final String url() {
		return this.url;
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

		generator.writeKey("details");
		generator.write(this.details);

		generator.writeKey("level");
		this.level.serialize(generator, mapper);
		generator.writeKey("message");
		generator.write(this.message);

		generator.writeKey("url");
		generator.write(this.url);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Deprecation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Deprecation> {
		private String details;

		private DeprecationLevel level;

		private String message;

		private String url;

		/**
		 * Required - API name: {@code details}
		 */
		public final Builder details(String value) {
			this.details = value;
			return this;
		}

		/**
		 * Required - The level property describes the significance of the issue.
		 * <p>
		 * API name: {@code level}
		 */
		public final Builder level(DeprecationLevel value) {
			this.level = value;
			return this;
		}

		/**
		 * Required - API name: {@code message}
		 */
		public final Builder message(String value) {
			this.message = value;
			return this;
		}

		/**
		 * Required - API name: {@code url}
		 */
		public final Builder url(String value) {
			this.url = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Deprecation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Deprecation build() {
			_checkSingleUse();

			return new Deprecation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Deprecation}
	 */
	public static final JsonpDeserializer<Deprecation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Deprecation::setupDeprecationDeserializer);

	protected static void setupDeprecationDeserializer(ObjectDeserializer<Deprecation.Builder> op) {

		op.add(Builder::details, JsonpDeserializer.stringDeserializer(), "details");
		op.add(Builder::level, DeprecationLevel._DESERIALIZER, "level");
		op.add(Builder::message, JsonpDeserializer.stringDeserializer(), "message");
		op.add(Builder::url, JsonpDeserializer.stringDeserializer(), "url");

	}

}
