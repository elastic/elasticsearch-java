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

package co.elastic.clients.elasticsearch.license.post;

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
import java.util.List;
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

// typedef: license.post.Acknowledgement

/**
 *
 * @see <a href="../../doc-files/api-spec.html#license.post.Acknowledgement">API
 *      specification</a>
 */
@JsonpDeserializable
public class Acknowledgement implements JsonpSerializable {
	private final List<String> license;

	private final String message;

	// ---------------------------------------------------------------------------------------------

	private Acknowledgement(Builder builder) {

		this.license = ApiTypeHelper.unmodifiableRequired(builder.license, this, "license");
		this.message = ApiTypeHelper.requireNonNull(builder.message, this, "message");

	}

	public static Acknowledgement of(Function<Builder, ObjectBuilder<Acknowledgement>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code license}
	 */
	public final List<String> license() {
		return this.license;
	}

	/**
	 * Required - API name: {@code message}
	 */
	public final String message() {
		return this.message;
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

		if (ApiTypeHelper.isDefined(this.license)) {
			generator.writeKey("license");
			generator.writeStartArray();
			for (String item0 : this.license) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("message");
		generator.write(this.message);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Acknowledgement}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Acknowledgement> {
		private List<String> license;

		private String message;

		/**
		 * Required - API name: {@code license}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>license</code>.
		 */
		public final Builder license(List<String> list) {
			this.license = _listAddAll(this.license, list);
			return this;
		}

		/**
		 * Required - API name: {@code license}
		 * <p>
		 * Adds one or more values to <code>license</code>.
		 */
		public final Builder license(String value, String... values) {
			this.license = _listAdd(this.license, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code message}
		 */
		public final Builder message(String value) {
			this.message = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Acknowledgement}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Acknowledgement build() {
			_checkSingleUse();

			return new Acknowledgement(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Acknowledgement}
	 */
	public static final JsonpDeserializer<Acknowledgement> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Acknowledgement::setupAcknowledgementDeserializer);

	protected static void setupAcknowledgementDeserializer(ObjectDeserializer<Acknowledgement.Builder> op) {

		op.add(Builder::license, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"license");
		op.add(Builder::message, JsonpDeserializer.stringDeserializer(), "message");

	}

}
