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

package co.elastic.clients.elasticsearch.license.post;

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
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: license.post.Acknowledgement
@JsonpDeserializable
public class Acknowledgement implements JsonpSerializable {
	private final List<String> license;

	private final String message;

	// ---------------------------------------------------------------------------------------------

	private Acknowledgement(Builder builder) {

		this.license = ModelTypeHelper.unmodifiableRequired(builder.license, this, "license");
		this.message = ModelTypeHelper.requireNonNull(builder.message, this, "message");

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

		if (ModelTypeHelper.isDefined(this.license)) {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Acknowledgement}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Acknowledgement> {
		private List<String> license;

		private String message;

		/**
		 * Required - API name: {@code license}
		 */
		public final Builder license(List<String> value) {
			this.license = value;
			return this;
		}

		/**
		 * Required - API name: {@code license}
		 */
		public final Builder license(String... value) {
			this.license = Arrays.asList(value);
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
			Acknowledgement::setupAcknowledgementDeserializer, Builder::build);

	protected static void setupAcknowledgementDeserializer(DelegatingDeserializer<Acknowledgement.Builder> op) {

		op.add(Builder::license, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"license");
		op.add(Builder::message, JsonpDeserializer.stringDeserializer(), "message");

	}

}
