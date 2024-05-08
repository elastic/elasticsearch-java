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

// typedef: ingest._types.RemoveProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.RemoveProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class RemoveProcessor extends ProcessorBase implements ProcessorVariant {
	private final List<String> field;

	private final List<String> keep;

	@Nullable
	private final Boolean ignoreMissing;

	// ---------------------------------------------------------------------------------------------

	private RemoveProcessor(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.unmodifiableRequired(builder.field, this, "field");
		this.keep = ApiTypeHelper.unmodifiable(builder.keep);
		this.ignoreMissing = builder.ignoreMissing;

	}

	public static RemoveProcessor of(Function<Builder, ObjectBuilder<RemoveProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Remove;
	}

	/**
	 * Required - Fields to be removed. Supports template snippets.
	 * <p>
	 * API name: {@code field}
	 */
	public final List<String> field() {
		return this.field;
	}

	/**
	 * Fields to be kept. When set, all fields other than those specified are
	 * removed.
	 * <p>
	 * API name: {@code keep}
	 */
	public final List<String> keep() {
		return this.keep;
	}

	/**
	 * If <code>true</code> and <code>field</code> does not exist or is
	 * <code>null</code>, the processor quietly exits without modifying the
	 * document.
	 * <p>
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public final Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.field)) {
			generator.writeKey("field");
			generator.writeStartArray();
			for (String item0 : this.field) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.keep)) {
			generator.writeKey("keep");
			generator.writeStartArray();
			for (String item0 : this.keep) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.ignoreMissing != null) {
			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RemoveProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RemoveProcessor> {
		private List<String> field;

		@Nullable
		private List<String> keep;

		@Nullable
		private Boolean ignoreMissing;

		/**
		 * Required - Fields to be removed. Supports template snippets.
		 * <p>
		 * API name: {@code field}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>field</code>.
		 */
		public final Builder field(List<String> list) {
			this.field = _listAddAll(this.field, list);
			return this;
		}

		/**
		 * Required - Fields to be removed. Supports template snippets.
		 * <p>
		 * API name: {@code field}
		 * <p>
		 * Adds one or more values to <code>field</code>.
		 */
		public final Builder field(String value, String... values) {
			this.field = _listAdd(this.field, value, values);
			return this;
		}

		/**
		 * Fields to be kept. When set, all fields other than those specified are
		 * removed.
		 * <p>
		 * API name: {@code keep}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>keep</code>.
		 */
		public final Builder keep(List<String> list) {
			this.keep = _listAddAll(this.keep, list);
			return this;
		}

		/**
		 * Fields to be kept. When set, all fields other than those specified are
		 * removed.
		 * <p>
		 * API name: {@code keep}
		 * <p>
		 * Adds one or more values to <code>keep</code>.
		 */
		public final Builder keep(String value, String... values) {
			this.keep = _listAdd(this.keep, value, values);
			return this;
		}

		/**
		 * If <code>true</code> and <code>field</code> does not exist or is
		 * <code>null</code>, the processor quietly exits without modifying the
		 * document.
		 * <p>
		 * API name: {@code ignore_missing}
		 */
		public final Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RemoveProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RemoveProcessor build() {
			_checkSingleUse();

			return new RemoveProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RemoveProcessor}
	 */
	public static final JsonpDeserializer<RemoveProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RemoveProcessor::setupRemoveProcessorDeserializer);

	protected static void setupRemoveProcessorDeserializer(ObjectDeserializer<RemoveProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "field");
		op.add(Builder::keep, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "keep");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");

	}

}
