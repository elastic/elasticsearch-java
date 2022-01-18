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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.SetSecurityUserProcessor

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ingest._types.SetSecurityUserProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class SetSecurityUserProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	private final List<String> properties;

	// ---------------------------------------------------------------------------------------------

	private SetSecurityUserProcessor(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.properties = ApiTypeHelper.unmodifiable(builder.properties);

	}

	public static SetSecurityUserProcessor of(Function<Builder, ObjectBuilder<SetSecurityUserProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.SetSecurityUser;
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

		if (ApiTypeHelper.isDefined(this.properties)) {
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
		 * <p>
		 * Adds all elements of <code>list</code> to <code>properties</code>.
		 */
		public final Builder properties(List<String> list) {
			this.properties = _listAddAll(this.properties, list);
			return this;
		}

		/**
		 * API name: {@code properties}
		 * <p>
		 * Adds one or more values to <code>properties</code>.
		 */
		public final Builder properties(String value, String... values) {
			this.properties = _listAdd(this.properties, value, values);
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
			.lazy(Builder::new, SetSecurityUserProcessor::setupSetSecurityUserProcessorDeserializer);

	protected static void setupSetSecurityUserProcessorDeserializer(
			ObjectDeserializer<SetSecurityUserProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::properties, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"properties");

	}

}
