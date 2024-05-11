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

package co.elastic.clients.elasticsearch.ml;

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

// typedef: ml._types.ModelSnapshotUpgrade

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.ModelSnapshotUpgrade">API
 *      specification</a>
 */
@JsonpDeserializable
public class ModelSnapshotUpgrade implements JsonpSerializable {
	private final String jobId;

	private final String snapshotId;

	private final SnapshotUpgradeState state;

	private final DiscoveryNode node;

	private final String assignmentExplanation;

	// ---------------------------------------------------------------------------------------------

	private ModelSnapshotUpgrade(Builder builder) {

		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.snapshotId = ApiTypeHelper.requireNonNull(builder.snapshotId, this, "snapshotId");
		this.state = ApiTypeHelper.requireNonNull(builder.state, this, "state");
		this.node = ApiTypeHelper.requireNonNull(builder.node, this, "node");
		this.assignmentExplanation = ApiTypeHelper.requireNonNull(builder.assignmentExplanation, this,
				"assignmentExplanation");

	}

	public static ModelSnapshotUpgrade of(Function<Builder, ObjectBuilder<ModelSnapshotUpgrade>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Required - API name: {@code snapshot_id}
	 */
	public final String snapshotId() {
		return this.snapshotId;
	}

	/**
	 * Required - API name: {@code state}
	 */
	public final SnapshotUpgradeState state() {
		return this.state;
	}

	/**
	 * Required - API name: {@code node}
	 */
	public final DiscoveryNode node() {
		return this.node;
	}

	/**
	 * Required - API name: {@code assignment_explanation}
	 */
	public final String assignmentExplanation() {
		return this.assignmentExplanation;
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

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("snapshot_id");
		generator.write(this.snapshotId);

		generator.writeKey("state");
		this.state.serialize(generator, mapper);
		generator.writeKey("node");
		this.node.serialize(generator, mapper);

		generator.writeKey("assignment_explanation");
		generator.write(this.assignmentExplanation);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ModelSnapshotUpgrade}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ModelSnapshotUpgrade> {
		private String jobId;

		private String snapshotId;

		private SnapshotUpgradeState state;

		private DiscoveryNode node;

		private String assignmentExplanation;

		/**
		 * Required - API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Required - API name: {@code snapshot_id}
		 */
		public final Builder snapshotId(String value) {
			this.snapshotId = value;
			return this;
		}

		/**
		 * Required - API name: {@code state}
		 */
		public final Builder state(SnapshotUpgradeState value) {
			this.state = value;
			return this;
		}

		/**
		 * Required - API name: {@code node}
		 */
		public final Builder node(DiscoveryNode value) {
			this.node = value;
			return this;
		}

		/**
		 * Required - API name: {@code node}
		 */
		public final Builder node(Function<DiscoveryNode.Builder, ObjectBuilder<DiscoveryNode>> fn) {
			return this.node(fn.apply(new DiscoveryNode.Builder()).build());
		}

		/**
		 * Required - API name: {@code assignment_explanation}
		 */
		public final Builder assignmentExplanation(String value) {
			this.assignmentExplanation = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ModelSnapshotUpgrade}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ModelSnapshotUpgrade build() {
			_checkSingleUse();

			return new ModelSnapshotUpgrade(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ModelSnapshotUpgrade}
	 */
	public static final JsonpDeserializer<ModelSnapshotUpgrade> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ModelSnapshotUpgrade::setupModelSnapshotUpgradeDeserializer);

	protected static void setupModelSnapshotUpgradeDeserializer(ObjectDeserializer<ModelSnapshotUpgrade.Builder> op) {

		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::snapshotId, JsonpDeserializer.stringDeserializer(), "snapshot_id");
		op.add(Builder::state, SnapshotUpgradeState._DESERIALIZER, "state");
		op.add(Builder::node, DiscoveryNode._DESERIALIZER, "node");
		op.add(Builder::assignmentExplanation, JsonpDeserializer.stringDeserializer(), "assignment_explanation");

	}

}
