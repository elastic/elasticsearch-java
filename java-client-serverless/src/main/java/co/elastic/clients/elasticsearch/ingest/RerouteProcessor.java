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

// typedef: ingest._types.RerouteProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.RerouteProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class RerouteProcessor extends ProcessorBase implements ProcessorVariant {
	@Nullable
	private final String destination;

	private final List<String> dataset;

	private final List<String> namespace;

	// ---------------------------------------------------------------------------------------------

	private RerouteProcessor(Builder builder) {
		super(builder);

		this.destination = builder.destination;
		this.dataset = ApiTypeHelper.unmodifiable(builder.dataset);
		this.namespace = ApiTypeHelper.unmodifiable(builder.namespace);

	}

	public static RerouteProcessor of(Function<Builder, ObjectBuilder<RerouteProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Reroute;
	}

	/**
	 * A static value for the target. Can’t be set when the dataset or namespace
	 * option is set.
	 * <p>
	 * API name: {@code destination}
	 */
	@Nullable
	public final String destination() {
		return this.destination;
	}

	/**
	 * Field references or a static value for the dataset part of the data stream
	 * name. In addition to the criteria for index names, cannot contain - and must
	 * be no longer than 100 characters. Example values are nginx.access and
	 * nginx.error.
	 * <p>
	 * Supports field references with a mustache-like syntax (denoted as {{double}}
	 * or {{{triple}}} curly braces). When resolving field references, the processor
	 * replaces invalid characters with _. Uses the &lt;dataset&gt; part of the
	 * index name as a fallback if all field references resolve to a null, missing,
	 * or non-string value.
	 * <p>
	 * default {{data_stream.dataset}}
	 * <p>
	 * API name: {@code dataset}
	 */
	public final List<String> dataset() {
		return this.dataset;
	}

	/**
	 * Field references or a static value for the namespace part of the data stream
	 * name. See the criteria for index names for allowed characters. Must be no
	 * longer than 100 characters.
	 * <p>
	 * Supports field references with a mustache-like syntax (denoted as {{double}}
	 * or {{{triple}}} curly braces). When resolving field references, the processor
	 * replaces invalid characters with _. Uses the &lt;namespace&gt; part of the
	 * index name as a fallback if all field references resolve to a null, missing,
	 * or non-string value.
	 * <p>
	 * default {{data_stream.namespace}}
	 * <p>
	 * API name: {@code namespace}
	 */
	public final List<String> namespace() {
		return this.namespace;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.destination != null) {
			generator.writeKey("destination");
			generator.write(this.destination);

		}
		if (ApiTypeHelper.isDefined(this.dataset)) {
			generator.writeKey("dataset");
			generator.writeStartArray();
			for (String item0 : this.dataset) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.namespace)) {
			generator.writeKey("namespace");
			generator.writeStartArray();
			for (String item0 : this.namespace) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RerouteProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RerouteProcessor> {
		@Nullable
		private String destination;

		@Nullable
		private List<String> dataset;

		@Nullable
		private List<String> namespace;

		/**
		 * A static value for the target. Can’t be set when the dataset or namespace
		 * option is set.
		 * <p>
		 * API name: {@code destination}
		 */
		public final Builder destination(@Nullable String value) {
			this.destination = value;
			return this;
		}

		/**
		 * Field references or a static value for the dataset part of the data stream
		 * name. In addition to the criteria for index names, cannot contain - and must
		 * be no longer than 100 characters. Example values are nginx.access and
		 * nginx.error.
		 * <p>
		 * Supports field references with a mustache-like syntax (denoted as {{double}}
		 * or {{{triple}}} curly braces). When resolving field references, the processor
		 * replaces invalid characters with _. Uses the &lt;dataset&gt; part of the
		 * index name as a fallback if all field references resolve to a null, missing,
		 * or non-string value.
		 * <p>
		 * default {{data_stream.dataset}}
		 * <p>
		 * API name: {@code dataset}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>dataset</code>.
		 */
		public final Builder dataset(List<String> list) {
			this.dataset = _listAddAll(this.dataset, list);
			return this;
		}

		/**
		 * Field references or a static value for the dataset part of the data stream
		 * name. In addition to the criteria for index names, cannot contain - and must
		 * be no longer than 100 characters. Example values are nginx.access and
		 * nginx.error.
		 * <p>
		 * Supports field references with a mustache-like syntax (denoted as {{double}}
		 * or {{{triple}}} curly braces). When resolving field references, the processor
		 * replaces invalid characters with _. Uses the &lt;dataset&gt; part of the
		 * index name as a fallback if all field references resolve to a null, missing,
		 * or non-string value.
		 * <p>
		 * default {{data_stream.dataset}}
		 * <p>
		 * API name: {@code dataset}
		 * <p>
		 * Adds one or more values to <code>dataset</code>.
		 */
		public final Builder dataset(String value, String... values) {
			this.dataset = _listAdd(this.dataset, value, values);
			return this;
		}

		/**
		 * Field references or a static value for the namespace part of the data stream
		 * name. See the criteria for index names for allowed characters. Must be no
		 * longer than 100 characters.
		 * <p>
		 * Supports field references with a mustache-like syntax (denoted as {{double}}
		 * or {{{triple}}} curly braces). When resolving field references, the processor
		 * replaces invalid characters with _. Uses the &lt;namespace&gt; part of the
		 * index name as a fallback if all field references resolve to a null, missing,
		 * or non-string value.
		 * <p>
		 * default {{data_stream.namespace}}
		 * <p>
		 * API name: {@code namespace}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>namespace</code>.
		 */
		public final Builder namespace(List<String> list) {
			this.namespace = _listAddAll(this.namespace, list);
			return this;
		}

		/**
		 * Field references or a static value for the namespace part of the data stream
		 * name. See the criteria for index names for allowed characters. Must be no
		 * longer than 100 characters.
		 * <p>
		 * Supports field references with a mustache-like syntax (denoted as {{double}}
		 * or {{{triple}}} curly braces). When resolving field references, the processor
		 * replaces invalid characters with _. Uses the &lt;namespace&gt; part of the
		 * index name as a fallback if all field references resolve to a null, missing,
		 * or non-string value.
		 * <p>
		 * default {{data_stream.namespace}}
		 * <p>
		 * API name: {@code namespace}
		 * <p>
		 * Adds one or more values to <code>namespace</code>.
		 */
		public final Builder namespace(String value, String... values) {
			this.namespace = _listAdd(this.namespace, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RerouteProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RerouteProcessor build() {
			_checkSingleUse();

			return new RerouteProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RerouteProcessor}
	 */
	public static final JsonpDeserializer<RerouteProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RerouteProcessor::setupRerouteProcessorDeserializer);

	protected static void setupRerouteProcessorDeserializer(ObjectDeserializer<RerouteProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::destination, JsonpDeserializer.stringDeserializer(), "destination");
		op.add(Builder::dataset, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"dataset");
		op.add(Builder::namespace, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"namespace");

	}

}
