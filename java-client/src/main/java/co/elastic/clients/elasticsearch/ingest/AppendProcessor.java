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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: ingest._types.AppendProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.AppendProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class AppendProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	private final List<JsonData> value;

	@Nullable
	private final Boolean allowDuplicates;

	// ---------------------------------------------------------------------------------------------

	private AppendProcessor(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.value = ApiTypeHelper.unmodifiableRequired(builder.value, this, "value");
		this.allowDuplicates = builder.allowDuplicates;

	}

	public static AppendProcessor of(Function<Builder, ObjectBuilder<AppendProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Append;
	}

	/**
	 * Required - The field to be appended to. Supports template snippets.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - The value to be appended. Supports template snippets.
	 * <p>
	 * API name: {@code value}
	 */
	public final List<JsonData> value() {
		return this.value;
	}

	/**
	 * If <code>false</code>, the processor does not append values already present
	 * in the field.
	 * <p>
	 * API name: {@code allow_duplicates}
	 */
	@Nullable
	public final Boolean allowDuplicates() {
		return this.allowDuplicates;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (ApiTypeHelper.isDefined(this.value)) {
			generator.writeKey("value");
			generator.writeStartArray();
			for (JsonData item0 : this.value) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.allowDuplicates != null) {
			generator.writeKey("allow_duplicates");
			generator.write(this.allowDuplicates);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AppendProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AppendProcessor> {
		private String field;

		private List<JsonData> value;

		@Nullable
		private Boolean allowDuplicates;

		/**
		 * Required - The field to be appended to. Supports template snippets.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - The value to be appended. Supports template snippets.
		 * <p>
		 * API name: {@code value}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>value</code>.
		 */
		public final Builder value(List<JsonData> list) {
			this.value = _listAddAll(this.value, list);
			return this;
		}

		/**
		 * Required - The value to be appended. Supports template snippets.
		 * <p>
		 * API name: {@code value}
		 * <p>
		 * Adds one or more values to <code>value</code>.
		 */
		public final Builder value(JsonData value, JsonData... values) {
			this.value = _listAdd(this.value, value, values);
			return this;
		}

		/**
		 * If <code>false</code>, the processor does not append values already present
		 * in the field.
		 * <p>
		 * API name: {@code allow_duplicates}
		 */
		public final Builder allowDuplicates(@Nullable Boolean value) {
			this.allowDuplicates = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AppendProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AppendProcessor build() {
			_checkSingleUse();

			return new AppendProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AppendProcessor}
	 */
	public static final JsonpDeserializer<AppendProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AppendProcessor::setupAppendProcessorDeserializer);

	protected static void setupAppendProcessorDeserializer(ObjectDeserializer<AppendProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::value, JsonpDeserializer.arrayDeserializer(JsonData._DESERIALIZER), "value");
		op.add(Builder::allowDuplicates, JsonpDeserializer.booleanDeserializer(), "allow_duplicates");

	}

}
