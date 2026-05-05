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

package co.elastic.clients.elasticsearch.inference;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
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

// typedef: inference._types.DeleteInferenceEndpointResult

/**
 * Acknowledged response. For dry_run, contains the list of pipelines which
 * reference the inference endpoint
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.DeleteInferenceEndpointResult">API
 *      specification</a>
 */

public abstract class DeleteInferenceEndpointResult extends AcknowledgedResponseBase {
	private final List<String> pipelines;

	// ---------------------------------------------------------------------------------------------

	protected DeleteInferenceEndpointResult(AbstractBuilder<?> builder) {
		super(builder);

		this.pipelines = ApiTypeHelper.unmodifiableRequired(builder.pipelines, this, "pipelines");

	}

	/**
	 * Required - API name: {@code pipelines}
	 */
	public final List<String> pipelines() {
		return this.pipelines;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.pipelines)) {
			generator.writeKey("pipelines");
			generator.writeStartArray();
			for (String item0 : this.pipelines) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				AcknowledgedResponseBase.AbstractBuilder<BuilderT> {
		private List<String> pipelines;

		/**
		 * Required - API name: {@code pipelines}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>pipelines</code>.
		 */
		public final BuilderT pipelines(List<String> list) {
			this.pipelines = _listAddAll(this.pipelines, list);
			return self();
		}

		/**
		 * Required - API name: {@code pipelines}
		 * <p>
		 * Adds one or more values to <code>pipelines</code>.
		 */
		public final BuilderT pipelines(String value, String... values) {
			this.pipelines = _listAdd(this.pipelines, value, values);
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupDeleteInferenceEndpointResultDeserializer(
			ObjectDeserializer<BuilderT> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
		op.add(AbstractBuilder::pipelines, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"pipelines");

	}

}
