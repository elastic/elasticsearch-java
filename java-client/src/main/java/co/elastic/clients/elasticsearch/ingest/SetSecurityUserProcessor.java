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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.SetSecurityUserProcessor
@JsonpDeserializable
public class SetSecurityUserProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	private final List<String> properties;

	// ---------------------------------------------------------------------------------------------

	private SetSecurityUserProcessor(Builder builder) {
		super(builder);

		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.properties = ModelTypeHelper.unmodifiable(builder.properties);

	}

	public static SetSecurityUserProcessor of(Function<Builder, ObjectBuilder<SetSecurityUserProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Processor} variant type
	 */
	@Override
	public String _variantType() {
		return "set_security_user";
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code properties}
	 */
	public final List<String> properties() {
		return this.properties;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (ModelTypeHelper.isDefined(this.properties)) {
			generator.writeKey("properties");
			generator.writeStartArray();
			for (String item0 : this.properties) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SetSecurityUserProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SetSecurityUserProcessor> {
		private String field;

		@Nullable
		private List<String> properties;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code properties}
		 */
		public final Builder properties(@Nullable List<String> value) {
			this.properties = value;
			return this;
		}

		/**
		 * API name: {@code properties}
		 */
		public final Builder properties(String... value) {
			this.properties = Arrays.asList(value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SetSecurityUserProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SetSecurityUserProcessor build() {
			_checkSingleUse();

			return new SetSecurityUserProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SetSecurityUserProcessor}
	 */
	public static final JsonpDeserializer<SetSecurityUserProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SetSecurityUserProcessor::setupSetSecurityUserProcessorDeserializer, Builder::build);

	protected static void setupSetSecurityUserProcessorDeserializer(
			DelegatingDeserializer<SetSecurityUserProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::properties, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"properties");

	}

}
